package cn.cn;
import cn.cn.dao.UsersDAO;
import cn.cn.dbentity.Users;
import cn.cn.util.SQLTime;


public class MainApp {
    public static void main(String args[])
    {
        try {

            Users s = new Users(5,"小智","451236",23,"男","北京市大兴区",new SQLTime().SQLDateTime());
            UsersDAO udao = new UsersDAO();
            if (udao.addStudent(s)){
                System.out.println("添加成功");
            }else
            {
                System.out.println("添加失败");
            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

