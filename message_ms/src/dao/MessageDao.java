package dao;

import entity.MessageBean;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import util.DBHelper;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;

public class MessageDao {

    public MessageBean addMessage(MessageBean messageBean)throws Exception{
        Connection conn = DBHelper.getConnection();
        String sql = "insert into MessageInfo values(?,?)";
        try {
            BigDecimal res = new QueryRunner().insert(conn, sql, new ScalarHandler<BigDecimal>(), MessageBean.getMcontent(), MessageBean.getPublish());
            MessageBean.setMid(res.longValue());
            return MessageBean;
        }finally {
            DbUtils.closeQuietly(conn);
        }
    }

    public List<MessageBean> listAll() throws Exception {
        Connection conn = DBHelper.getConnection();
        String sql = "select id, name, price, birth from cup2";
        try {
            return new QueryRunner().query(
                    conn, sql, new BeanListHandler<MessageBean>(MessageBean.class));
        } finally {
            DbUtils.closeQuietly(conn);
        }
    }

    public void delete(String id) throws Exception {
        Connection conn = DBHelper.getConnection();
        String sql = "delete from MessageInfo where id = ?";
        try {
            new QueryRunner().update(conn, sql, id);
        } finally {
            DbUtils.closeQuietly(conn);
        }
    }

    public void deletes(String[] ids) throws Exception {
        Connection conn = DBHelper.getConnection();
        String sql = "delete from MessageInfo where id in (";
        for (int i = 0; i < ids.length; i++){
            if (i == ids.length -1){
                sql += "?)";
                break;
            }
            sql += "?,";
        }
        try {
            new QueryRunner().update(conn, sql, ids);
        } finally {
            DbUtils.closeQuietly(conn);
        }
    }
}
