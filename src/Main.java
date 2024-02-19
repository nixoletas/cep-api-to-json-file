import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        CepSearch search = new CepSearch();
        try {

        Address newAddress = search.searchAddress("79113140");
        System.out.println(newAddress);
        GenerateFile generateFile = new GenerateFile();
        generateFile.saveJson(newAddress);

        } catch (RuntimeException e) {

            System.out.println(e.getMessage());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}