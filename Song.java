public class Song implements Comparable<Song> {





  
  // track_number,
  // artist_name,
  // track_name,
  // track_id,
  // popularity,
  // year,
  // genre,
  // danceability,
  // energy,
  // key,
  // loudness,
  // mode,
  // speechiness,
  // acousticness,
  // instrumentalness,
  // liveness,
  // valence,
  // tempo,
  // duration_ms,
  // time_signature
  private int trackNumber;
  private String artistName;
  private String trackName;
  private String trackId;
  private int popularity;
  private int year;
  private String genre;
  private double danceability;
  private double energy;
  private int key;
  private double loudness;
  private int mode;
  private double speechiness;
  private double acousticness;
  private double instrumentalness;
  private double liveness;
  private double valence;
  private double tempo;
  private int durationMs;
  private int timeSignature;

  // Constructores, getters y setters
  public int compareTo(Song other) {
    return this.trackId.compareTo(other.trackId);
  }

  public Song() {}

  // Constructor
  public Song(
    int trackNumber,
    String artistName,
    String trackName,
    String trackId,
    int popularity,
    int year,
    String genre,
    double danceability,
    double energy,
    int key,
    double loudness,
    int mode,
    double speechiness,
    double acousticness,
    double instrumentalness,
    double liveness,
    double valence,
    double tempo,
    int durationMs,
    int timeSignature
  ) {
    this.trackNumber = trackNumber;
    this.artistName = artistName;
    this.trackName = trackName;
    this.trackId = trackId;
    this.popularity = popularity;
    this.year = year;
    this.genre = genre;
    this.danceability = danceability;
    this.energy = energy;
    this.key = key;
    this.loudness = loudness;
    this.mode = mode;
    this.speechiness = speechiness;
    this.acousticness = acousticness;
    this.instrumentalness = instrumentalness;
    this.liveness = liveness;
    this.valence = valence;
    this.tempo = tempo;
    this.durationMs = durationMs;
    this.timeSignature = timeSignature;
  }

  public String toString() {
    return (
      "{" +
      "trackNumber=" +
      trackNumber +
      ", artistName='" +
      artistName +
      '\'' +
      ", trackName='" +
      trackName +
      '\'' +
      ", trackId='" +
      trackId +
      '\'' +
      ", popularity=" +
      popularity +
      ", year=" +
      year +
      ", genre='" +
      genre +
      '\'' +
      ", danceability=" +
      danceability +
      ", energy=" +
      energy +
      ", key=" +
      key +
      ", loudness=" +
      loudness +
      ", mode=" +
      mode +
      ", speechiness=" +
      speechiness +
      ", acousticness=" +
      acousticness +
      ", instrumentalness=" +
      instrumentalness +
      ", liveness=" +
      liveness +
      ", valence=" +
      valence +
      ", tempo=" +
      tempo +
      ", durationMs=" +
      durationMs +
      ", timeSignature=" +
      timeSignature +
      "}\n"
    );
  }

  // Getters y Setters
  public int getTrackNumber() {
    return this.trackNumber;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public String getTrackName() {
    return trackName;
  }

  public void setTrackName(String trackName) {
    this.trackName = trackName;
  }

  public String getTrackId() {
    return trackId;
  }

  public void setTrackId(String trackId) {
    this.trackId = trackId;
  }

  public int getPopularity() {
    return popularity;
  }

  public void setPopularity(int popularity) {
    this.popularity = popularity;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public double getDanceability() {
    return danceability;
  }

  public void setTrackNumber(int trackNumber) {
    this.trackNumber = trackNumber;
  }

  public void setDanceability(double danceability) {
    this.danceability = danceability;
  }

  public double getEnergy() {
    return energy;
  }

  public void setEnergy(double energy) {
    this.energy = energy;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public double getLoudness() {
    return loudness;
  }

  public void setLoudness(double loudness) {
    this.loudness = loudness;
  }

  public int getMode() {
    return mode;
  }

  public void setMode(int mode) {
    this.mode = mode;
  }

  public double getSpeechiness() {
    return speechiness;
  }

  public void setSpeechiness(double speechiness) {
    this.speechiness = speechiness;
  }

  public double getAcousticness() {
    return acousticness;
  }

  public void setAcousticness(double acousticness) {
    this.acousticness = acousticness;
  }

  public double getInstrumentalness() {
    return instrumentalness;
  }

  public void setInstrumentalness(double instrumentalness) {
    this.instrumentalness = instrumentalness;
  }

  public double getLiveness() {
    return liveness;
  }

  public void setLiveness(double liveness) {
    this.liveness = liveness;
  }

  public double getValence() {
    return valence;
  }

  public void setValence(double valence) {
    this.valence = valence;
  }

  public double getTempo() {
    return tempo;
  }

  public void setTempo(double tempo) {
    this.tempo = tempo;
  }

  public int getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(int durationMs) {
    this.durationMs = durationMs;
  }

  public int getTimeSignature() {
    return timeSignature;
  }

  public void setTimeSignature(int timeSignature) {
    this.timeSignature = timeSignature;
  }
}
