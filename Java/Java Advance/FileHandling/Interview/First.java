package Interview;

import java.io.Serializable;

// Basic

public final class First implements Serializable {
    // 1 immutable object là 1 object k thể đổi, ta có thể tạo ra bằng cách dùng private + final
    private void changeData(Integer a) {
        a = a + 1;
    }
    private void changeData2(int[] a) {
        a[0]++;
    }
    public static void main(String[] args){
        First first = new First();
        int b = 10; // or Integer
        first.changeData(b);
        System.out.println(b);

        int[] c = {1,2,3};
        first.changeData2(c);
        System.out.println(c[0]); // 2
        // Giống hệt C++ về tham chiếu hay gì này nọ với các kiểu dữ liệu cơ bản
    }
}
