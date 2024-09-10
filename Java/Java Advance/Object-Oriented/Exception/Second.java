package Exception;

// Error handling try catch

class MyException extends Exception{
    String str1;
    MyException(String str2) {
        str1 = str2;
    }
    public String toString(){ 
        return ("MyException Occurred: " + str1) ;
    }
    // Or dùng: public MyException(String s){ super(s); } cx ok
}

class SecondClass{ // package k cần thiết trùng tên
    void check(int weight) throws MyException {
        if(weight < 100) {
            throw new MyException("Invalid Weight"); // Khi throw mà k có handle thì phải thêm throws ở hàm để nó forward lỗi ra ngoài
        }
    }
    public static void main(String args[]){
        SecondClass secondClass = new SecondClass();
        try{
            secondClass.check(19);
            throw new MyException("This is My error Message"); // K gọi đến cái này vì bắt Invalid weight luôn
        }
        catch(MyException exp){
            System.out.println(exp); // Tự gọi toString
        }
    }
}