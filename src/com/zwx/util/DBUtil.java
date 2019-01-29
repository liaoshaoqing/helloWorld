package com.zwx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/paper";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";
    
// ��ȡ����   
	public static Connection get_Connection() {
		Connection conn=null; 
		try { 
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return conn;
		    } catch (ClassNotFoundException e) {
			e.printStackTrace();
		    } catch (Exception e) {
			e.printStackTrace();
		    }  
		    return conn;
	    }
//	�ر���Դ
    public static void closeAll(ResultSet rs,PreparedStatement pstmt,Connection conn){
    	try {
    	    if(rs!=null)
    		   rs.close();
    	    if(pstmt!=null)
    		   pstmt.close();
    	    if(conn!=null)
    		   conn.close();
            } catch (SQLException e) {
		         e.printStackTrace();
	             }
    }
/**
 * ��װ����ɾ����
 * @param sql
 * @param obj
 * @return
 */
    public static int exeSql(String sql, Object... obj){
    	int result=0;
    	Connection conn=null;
    	PreparedStatement pstmt=null;
    	conn=get_Connection();
		try {
			pstmt=conn.prepareStatement(sql);
			if (obj.length > 0)
				for (int i = 0; i < obj.length; i++) {
					pstmt.setObject(i + 1, obj[i]);
				}
		
			result=pstmt.executeUpdate();	
		    }catch (SQLException e) {
			e.printStackTrace();
	        }
		    return result;
		}
}
