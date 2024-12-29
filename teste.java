public class SensitiveDataTest {

    // Configurações de Dados Sensíveis
    private static final String API_KEY = "1234567890abcdef1234567890abcdef";
    private static final String DB_PASSWORD = "SuperSecret123!";

  
    public static void main(String[] args) {
        System.out.println("Iniciando o teste...");
        
        // Testa conexão ao banco de dados
        if (connectToDatabase()) {
            System.out.println("Conexão ao banco de dados bem-sucedida!");
        } else {
            System.out.println("Falha na conexão ao banco de dados.");
        }

        // Testa chamada de API
        String response = makeApiCall();
        System.out.println("Resposta da API: " + response);
    }

    /**
     * Simula uma conexão ao banco de dados.
     *
     * @return true sempre para este teste.
     */
    private static boolean connectToDatabase() {
        String databaseUrl = String.format("jdbc:mysql://localhost:3306/test_db?user=admin&password=%s", DB_PASSWORD);
        System.out.println("Conectando ao banco de dados em: " + databaseUrl);

        return true;
    }

    /**
     * Simula uma chamada de API.
     *
     * @return Uma string representando a resposta da API.
     */
    private static String makeApiCall() {
        String endpoint = "https://api.example.com/data";
        System.out.println("Chamando API em: " + endpoint + " com chave: " + API_KEY);
      
        return "{ \"status\": \"success\" }";
    }
}
