package ioliu;

import java.io.*;
import java.util.Objects;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setUname("张三");
        teacher.setSalary(3000);
        //序列化
        objectSerializable(teacher);

        //反序列化
        fanXuLieHua();


    }

    /**
     * 将磁盘文件中的对象反序列化到内存
     */
    public static void fanXuLieHua() {
        //插吸管
        InputStream inputStream = null;
        ObjectInputStream ois = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream("D:\\teacher.txt"));
            //装饰吸管
            ois = new ObjectInputStream(inputStream);
            //开始喝水
            System.out.println(ois.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(ois!=null){
                //拔出来吸管
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }



    }


    /**
     * 将对象序列化到磁盘文件
     * 往磁盘写自定义类的对象时，自定义类一定要实现Serializable接口
     * 不想被序列化的属性，加上transient关键字修饰1
     *
     * @param o
     */
    public static void objectSerializable(Object o) {
        OutputStream outputStream = null;
        ObjectOutputStream oos = null;
        try {
            //创建吸管
            outputStream = new BufferedOutputStream(new FileOutputStream("D:\\teacher.txt"));
            //给吸管加点装饰
            oos = new ObjectOutputStream(outputStream);
            //开始往瓶子里吐水
            oos.writeObject(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

class Teacher implements Serializable {
    private int id;
    private String uname;
    private double salary;


    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id &&
                Double.compare(teacher.salary, salary) == 0 &&
                Objects.equals(uname, teacher.uname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uname, salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
