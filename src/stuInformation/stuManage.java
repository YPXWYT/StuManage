package stuInformation;

import java.sql.*;

public class stuManage {

    public void stuAlter(String tabName, String str1, String str2) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        String s = "update " + tabName + " set " + str1 + " where " + str2;
        try {
            conn = jdbcUtils.getConnection();
            stmt = conn.createStatement();
            int rs2 = stmt.executeUpdate(s);
            if (rs2 > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("执行失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.free(rs, stmt, conn);
        }

    }

    public void stuDelete(String tabName, String str1) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        String s = "DELETE FROM " + tabName + " WHERE num LIKE " + str1;
        try {
            conn = jdbcUtils.getConnection();
            stmt = conn.createStatement();
            int rs2 = stmt.executeUpdate(s);
            if (rs2 > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("执行失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.free(rs, stmt, conn);
        }
    }

    public void stuAdd(String tabName, String str1) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        String s = "INSERT INTO " + tabName + " values (" + str1 + ")";
        try {
            conn = jdbcUtils.getConnection();
            stmt = conn.createStatement();
            int rs1 = stmt.executeUpdate(s);
            if (rs1 > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("执行失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.free(rs, stmt, conn);
        }
    }

    /**
     * 学生展示
     *
     * @param tabName 选项卡名称
     */
    public void stuShow(String tabName) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        String s = "SELECT * FROM " + tabName;
        try {
            conn = jdbcUtils.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(s);
            while (rs.next()) {
                System.out.println(rs.getObject(1) + "\t" + rs.getObject(2) + "\t" +
                        rs.getObject(3) + "\t" + rs.getObject(4) + "\t" + rs.getObject(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.free(rs, stmt, conn);
        }

    }
}
