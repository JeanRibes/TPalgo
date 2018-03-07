import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.*;

/**
 * Gestionnaire d'affichage pour le jeu de la vie.
 * 
 * @author Brice Chardin <brice.chardin@insa-lyon.fr>
 */
public class AffichageFourmi extends JFrame {
    private static AffichageFourmi world = null;
    private PanneauGrille pg;
    private static int sleepTime = 500;

    private AffichageFourmi(Plateau monde, int maRes) {
        super("La fourmi de Langton");
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
    public static void afficherMonde(Plateau monde) {
        afficherMonde(monde,calcRes(monde.taille));
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {}
    }
    
    /**
     * Affiche un monde.
     * @param monde le monde à afficher
     * @param res longueur d'un coté de cellule (en nombre de pixel)
     */
    public static void afficherMonde(Plateau monde, int maRes) {
        if (world==null) {
            world = new AffichageFourmi(monde,maRes);
        }
        world.pg.simulation = monde;
        world.repaint();
    }
    
    /**
     * Calcul la resolution la plus appropriee a la taille du monde de
     * facon a ce que la fenetre occupe 80% de la hauteur ou de la
     * largeur de la zone utile de l'ecran
     * de l'ecran.
     * @param monde le monde à afficher
     */
    private static int calcRes(int taille) {
        final double p = .8; // pourcentage de la zone utile a occuper
        int resC;
        Rectangle bounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds(); // Taille zone utile
        resC = Math.min((int)(bounds.height*p)/taille,(int)(bounds.width*p)/taille);
        resC = Math.max(1,resC); // valeur planche de 1
        return resC;
    }
    
    /**
     * Modifie le temps d'attente entre deux affichages successifs.
     * @param delay le temps d'attente en millisecondes.
     */
    public static void pause(int delay) {
        AffichageFourmi.sleepTime = delay;
    }
    
    class PanneauGrille extends JPanel {
        private int res;
        private BufferedImage worldImage;
        public Plateau simulation;
        
        public PanneauGrille(Plateau simul, int maRes) {
            res = maRes;
            worldImage = new BufferedImage(res*simul.monde[0].length,res*simul.monde.length,BufferedImage.TYPE_INT_RGB);
            // System.out.println(new Dimension(res*monde[0].length,res*monde.length));
            setPreferredSize(new Dimension(res*simul.monde[0].length,res*simul.monde.length));
        }
        private void dessineMonde(Graphics g) {
            int nbL = simulation.monde.length;
            int nbC = simulation.monde[0].length;
            // couleur de fond
            g.setColor(Color.WHITE);
            g.fillRect(0,0,res*nbC,res*nbL);
            // cellules
            g.setColor(Color.BLACK);
            for (int i = 0; i < nbL; i++)
                for (int j = 0; j < nbC; j++)
                    if (simulation.monde[i][j])
                        g.fillRect(res*j,res*i,res,res);
            
            /* et on dessine la fourmi */
			g.setColor(Color.RED);
			g.fillRect(res * simulation.f.y, res * simulation.f.x, res, res);
        }
        public void paint(Graphics g) {
            Graphics gw = worldImage.getGraphics();
            dessineMonde(gw);
            g.drawImage(worldImage,0,0,null);
        }
    }
}       

