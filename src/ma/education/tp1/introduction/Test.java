package ma.education.tp1.introduction;

public class Test {
    public static void main(String[] args) {
        Salle o1 = new Salle();
        Salle o2 = new Salle("salle_informatique");
        Salle o3 = new Salle(2,"salle des cours");
        System.out.println("nom o2="+o2.nom);
        System.out.println("id o3="+o3.id);
        System.out.println("nom o3="+o3.nom);

    }

}
