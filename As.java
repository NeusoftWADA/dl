package dl;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
public class As {
	    private PreparedStatement ps;
	    private Connection conn;
	    ResultSet res;
	    public static final String url = "地址";
	    public static final String name = "";
	    public static final String user = "root";
	    public static final String password = "123456";
	    public As() {
	        ps = null;
	        res = null;
	        try {
	            Class.forName(name);
	            conn = DriverManager.getConnection(url,user,password);
	        }catch (Exception e) {
	            e.printStackTrace();
package dl;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
public class As {
	    private PreparedStatement ps;
	    private Connection conn;
	    ResultSet res;
	    public static final String url = "地址";
	    public static final String name = "";
	    public static final String user = "root";
	    public static final String password = "123456";
	    public As() {
	        ps = null;
	        res = null;
	        try {
	            Class.forName(name);
	            conn = DriverManager.getConnection(url,user,password);
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public ResultSet porb(String sql,Map<Integer,Integer> map) {
	        try {
	             ps = conn.prepareStatement(sql);
	            for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
	                ps.setInt(entry.getKey(),entry.getValue());
	            }
	            res = ps.executeQuery();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return res;
	    }
	    public String getResult(ResultSet result) {
	        String uName = "";
	        try {
	            while (result.next()) {
	                uName = result.getString("name");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return uName;
	    }
	    public static void main(String[] args) {
	        String sql = "select name from student where id = ? and stu_id = ?";
	        As conn = new As();
	        Map<Integer,Integer> map = new HashMap<>();
	        map.put(1,1);
	        map.put(2,901);
	        ResultSet res = conn.porb(sql,map);
	        String str = conn.getResult(res);
	        System.out.println(str);

	    }
}
