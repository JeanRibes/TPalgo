import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.*;

/**
 * Gestionnaire d'affichage pour le jeu de la vie.
 * @author Brice Chardin, modifiee par Jean-Francois TREGOUET
 */
public class Affichage extends JFrame {
    private static Affichage world = null;
    private PanneauGrille pg;

    private Affichage(boolean[][] monde, int maRes) {
        super("Automate cellulaire");
        pg = new PanneauGrille(monde,maRes);
        setContentPane(pg);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    /**
     * Surcharge de la methode afficherMonde qui permet de laisser le
     * programme choisir la resolution la plus appropriee a la taille
     * de l'ecran.
     * @param monde le monde à afficher
     */
    public static void afficherMonde(boolean[] t) {
        boolean[][] monde = new boolean[1][t.length];
        monde[0] = t;
        afficherMonde(monde);
    }


    public static void afficherMonde(boolean[][] monde) {
        afficherMonde(monde,calcRes(monde));
    }
    
    /**
     * Affiche un monde.
     * @param monde le monde à afficher
     * @param res longueur d'un coté de cellule (en nombre de pixel)
     */
    public static void afficherMonde(boolean[][] monde, int maRes) {
        if (world==null) {
            world = new Affichage(monde,maRes);
        }
        world.pg.monde = monde;
        world.repaint();
    }
    
    /**
     * Calcul la resolution la plus appropriee a la taille du monde de
     * facon a ce que la fenetre occupe 80% de la hauteur ou de la
     * largeur de la zone utile de l'ecran
     * de l'ecran.
     * @param monde le monde à afficher
     */
    private static int calcRes(boolean[][] monde) {
        final double p = .8; // pourcentage de la zone utile a occuper
        int resC;
        Rectangle bounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds(); // Taille zone utile
        resC = Math.min((int)(bounds.height*p)/monde.length,(int)(bounds.width*p)/monde[0].length);
        resC = Math.max(1,resC); // valeur planche de 1
        return resC;
    }
    
    class PanneauGrille extends JPanel {
        private int res;
        private BufferedImage worldImage;
        public boolean[][] monde;
        public PanneauGrille(boolean[][] monde, int maRes) {
            res = maRes;
            worldImage = new BufferedImage(res*monde[0].length,res*monde.length,BufferedImage.TYPE_INT_RGB);
            // System.out.println(new Dimension(res*monde[0].length,res*monde.length));
            setPreferredSize(new Dimension(res*monde[0].length,res*monde.length));
        }
        private void dessineMonde(Graphics g) {
            int nbL = monde.length;
            int nbC = monde[0].length;
            // couleur de fond
            g.setColor(Color.WHITE);
            g.fillRect(0,0,res*nbC,res*nbL);
            // cellules
            g.setColor(Color.BLACK);
            for (int i = 0; i < nbL; i++)
                for (int j = 0; j < nbC; j++)
                    if (monde[i][j])
                        g.fillRect(res*j,res*i,res,res);
        }
        public void paint(Graphics g) {
            Graphics gw = worldImage.getGraphics();
            dessineMonde(gw);
            g.drawImage(worldImage,0,0,null);
        }
    }
}       

