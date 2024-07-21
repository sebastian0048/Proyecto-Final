public class Main {

  public static void main(String[] args) {
    // Crear un árbol B con un grado mínimo de 3

    SongController controller = new SongController();
    Song c = controller.getbTree().search(1);
    System.out.println(c);
  }
}
