package src;

public class Newspaper{
    private String time;
    public Newspaper(String time){
        this.time = time;
    }
    public void release(final String string){
        class Message {
            private String mess;
            public Message(String string1){
                this.mess = string1;
            }
            public String getMess(){
                return mess;
            }
        }
        Message mes = new Message(string);
        System.out.println(" release " + " newspaper " + mes.getMess() );
    }
}