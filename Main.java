class Main {
  public static void main(String[] args) {
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");
    Matrice m = new Matrice("TPSIT");
    Vigenere v = new Vigenere (0, 12, 0, 12, m); 
    Thread t = new Thread(v);
     new Thread(v).start();
  }
}