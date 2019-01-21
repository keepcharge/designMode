package com.mine.design.Command_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-21 10:48
 * @Description:命令模式
 */
public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        //OpenCammand op = new OpenCammand(tv);
        CloseCommand op = new CloseCommand(tv);
        InvokerController ic = new InvokerController(op);
        ic.action();


    }
}

//抽象命令类
interface  Command{
    void execute();
}

//具体命令对象
class OpenCammand implements Command{
    private TV tv;

    public OpenCammand (TV tv){
        this.tv = tv;

    }
    @Override
    public void execute() {
        tv.open();
    }
}

class CloseCommand implements Command{
    private TV tv;

    public CloseCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.close();
    }
}

class ChangeCommand implements Command{
    private TV tv;

    public ChangeCommand(TV tv){
        this.tv = tv;
    }


    @Override
    public void execute() {
        tv.change();
    }
}


class InvokerController{
    Command command ;
    public  InvokerController(Command c){
        command = c;
    }
    void action(){
        command.execute();
    }
}


//接受者
class  TV {
    void open(){
        System.out.println("open tv");
    }
    void close(){
        System.out.println("close tv");
    }
    void change(){
        System.out.println("change tv");
    }
}
