public static void main(String[] args) {
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();
        Personne personne3 = new Personne();
        Personne personne4 = new Personne();

        // Affichage des compteurs
        System.out.println("personne1: (" + personne1.nbLocal + "," + Personne.nbInstances + ")");
        System.out.println("personne2: (" + personne2.nbLocal + "," + Personne.nbInstances + ")");
        System.out.println("personne3: (" + personne3.nbLocal + "," + Personne.nbInstances + ")");
        System.out.println("personne4: (" + personne4.nbLocal + "," + Personne.nbInstances + ")");
    }

