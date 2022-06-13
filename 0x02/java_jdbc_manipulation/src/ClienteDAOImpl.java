import java.sql.*;

public class ClienteDAOImpl implements ClienteDAO {

    private static Connection conn = null;

    @Override
    public Connection connect(String urlConexao) {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(urlConexao);
            } catch (SQLException e) {
                System.err.println(e.getMessage() + "Errouuuu");
            }
        }
        return conn;
    }

    public static void closeConnect(){
        if (conn != null){
            try {
                conn.close();
            }
            catch (SQLException e){
                throw new DbException(e.getMessage());
            }

        }
    }

    @Override
    public void createTable(String urlConexao) {
        try {
            conn = connect(urlConexao);
            Statement stm = conn.createStatement();
            stm.executeUpdate("DROP TABLE IF EXISTS pessoa");

            stm.executeUpdate("CREATE TABLE pessoa (" + "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
                        + "nome VARCHAR (80) NOT NULL," + "idade INTEGER NOT NULL," + "cpf VARCHAR (50) NOT NULL," + "RG VARCHAR (50) NOT NULL)");
            //conn.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void insert(String url_conexao, Cliente cliente) {
        Connection conn;
        PreparedStatement st;
        try {
            conn = connect(url_conexao);
            st = conn.prepareStatement(
                    "INSERT INTO pessoa "
                        + "(nome, idade, cpf, RG) " + "VALUES "
                        + "(?, ?, ?, ?)");

            st.setString(1, cliente.getNome());
            st.setInt(2, cliente.getIdade());
            st.setString(3, cliente.getCpf());
            st.setString(4, cliente.getRG());

            st.executeUpdate();
            //closeConnect();
        }
        catch (SQLException e){
            System.err.println(e.getMessage() + " cai aqui");
            //e.printStackTrace();
        }

    }

    @Override
    public void selectAll(String urlConexao) {
        Connection conn;
        Statement st;
        try {
            conn = connect(urlConexao);
            st = conn.createStatement();
            st.executeQuery(  "SELECT * FROM pessoa");
            //closeConnect();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void update(String urlConexao, int id, String name, Integer idade) {

        Connection conn;
        PreparedStatement st;
        try {
            conn = connect(urlConexao);
            st = conn.prepareStatement(
                    "UPDATE pessoa "
                            + "SET nome = ?, idade = ? "
                            + "WHERE "
                            + "id = ?");

            st.setString(1, name);
            st.setInt(2, idade);
            st.setInt(3, id);


            st.executeUpdate();
           // closeConnect();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String urlConexao, int id) {

        Connection conn;
        PreparedStatement st;
        try {
            conn = connect(urlConexao);
            st = conn.prepareStatement(
                    "DELETE FROM pessoa "
                            + "WHERE "
                            + "id = ?");

            st.setInt(1, id);

            st.executeUpdate();
           // closeConnect();
        }
        catch (SQLException e){
            e.printStackTrace();
        }


    }
}
