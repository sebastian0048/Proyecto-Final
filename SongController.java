import java.io.*;
import java.util.*;

public class SongController {

  private static final String CSV_FILE_PATH = "spotify_data.csv";
  private static final int BATCH_SIZE = 5000;
  private BTree<Integer, Song> bTree;

  public BTree<Integer, Song> getbTree() {
    return bTree;
  }

  public void setbTree(BTree<Integer, Song> bTree) {
    this.bTree = bTree;
  }

  public SongController() {
    bTree = new BTree<>();
    loadSongsFromCSV();
  }

  public void loadSongsFromCSV() {
    try (
      BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))
    ) {
      String line;
      br.readLine(); // Leer la primera línea que contiene los encabezados

      ArrayList<String[]> batch = new ArrayList<>();
      while ((line = br.readLine()) != null) {
        int number;
        String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

        if (values.length < 20) {
          //					System.out.println("Línea con datos incompletos: " + line);
          continue;
        }

        try {
          number = Integer.parseInt(values[0].replaceAll("\"", "").trim());
          Song song = new Song(
            Integer.parseInt(values[0].replaceAll("\"", "").trim()),
            values[1].replaceAll("\"", "").trim(),
            values[2].replaceAll("\"", "").trim(),
            values[3].replaceAll("\"", "").trim(),
            Integer.parseInt(values[4].replaceAll("\"", "").trim()),
            Integer.parseInt(values[5].replaceAll("\"", "").trim()),
            values[6].replaceAll("\"", "").trim(),
            Double.parseDouble(values[7].replaceAll("\"", "").trim()),
            Double.parseDouble(values[8].replaceAll("\"", "").trim()),
            Integer.parseInt(values[9].replaceAll("\"", "").trim()),
            Double.parseDouble(values[10].replaceAll("\"", "").trim()),
            Integer.parseInt(values[11].replaceAll("\"", "").trim()),
            Double.parseDouble(values[12].replaceAll("\"", "").trim()),
            Double.parseDouble(values[13].replaceAll("\"", "").trim()),
            Double.parseDouble(values[14].replaceAll("\"", "").trim()),
            Double.parseDouble(values[15].replaceAll("\"", "").trim()),
            Double.parseDouble(values[16].replaceAll("\"", "").trim()),
            Double.parseDouble(values[17].replaceAll("\"", "").trim()),
            Integer.parseInt(values[18].replaceAll("\"", "").trim()),
            Integer.parseInt(values[19].replaceAll("\"", "").trim())
          );
          bTree.insert(number, song);
        } catch (NumberFormatException e) {
          System.out.println(e.getMessage());
          //					System.out.println("Excepción de formato en línea: " + line);
        }

        if (batch.size() >= BATCH_SIZE) {
          processBatch(batch);
          batch.clear();
        }
      }

      if (!batch.isEmpty()) {
        processBatch(batch);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void processBatch(ArrayList<String[]> batch) {
    int number;
    for (String[] values : batch) {
      try {
        number = Integer.parseInt(values[0].replaceAll("\"", "").trim());
        Song song = new Song(
          Integer.parseInt(values[0].replaceAll("\"", "").trim()),
          values[1].replaceAll("\"", "").trim(),
          values[2].replaceAll("\"", "").trim(),
          values[3].replaceAll("\"", "").trim(),
          Integer.parseInt(values[4].replaceAll("\"", "").trim()),
          Integer.parseInt(values[5].replaceAll("\"", "").trim()),
          values[6].replaceAll("\"", "").trim(),
          Double.parseDouble(values[7].replaceAll("\"", "").trim()),
          Double.parseDouble(values[8].replaceAll("\"", "").trim()),
          Integer.parseInt(values[9].replaceAll("\"", "").trim()),
          Double.parseDouble(values[10].replaceAll("\"", "").trim()),
          Integer.parseInt(values[11].replaceAll("\"", "").trim()),
          Double.parseDouble(values[12].replaceAll("\"", "").trim()),
          Double.parseDouble(values[13].replaceAll("\"", "").trim()),
          Double.parseDouble(values[14].replaceAll("\"", "").trim()),
          Double.parseDouble(values[15].replaceAll("\"", "").trim()),
          Double.parseDouble(values[16].replaceAll("\"", "").trim()),
          Double.parseDouble(values[17].replaceAll("\"", "").trim()),
          Integer.parseInt(values[18].replaceAll("\"", "").trim()),
          Integer.parseInt(values[19].replaceAll("\"", "").trim())
        );
        bTree.insert(number, song);
      } catch (NumberFormatException e) {
        System.out.println(e.getMessage());
        //				System.out.println("Excepción de formato en línea: " + String.join(",", values));
      }
    }
  }

  public void addCancion(int number, Song cancion) {
    bTree.insert(number, cancion);
  }

  public void eliminarCancion(int key) {
    bTree.delete(key);
  }
}
