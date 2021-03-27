public class demo {
    public static void main(String[] args) {
        //System.out.println("Hello World!!!!");
//        1 : comment code
//        ctrl + "/" "**"
//        2 : kiểu dữ liệu
//         nhom kieu du lieu nguyen thuy : không hỗ trợ phương thức xử lý
//         nhom kieu du lieu doi tuong : hõ trợ phương thức xử lý
//         int, boolean, double, float, char...
//        String,Integer, Boolean, Double, Float, CharSequence
/*        3 : khai báo biến

          nháy đơn truyền kí tự, nháy kép truyền chuỗi
                */
        String name = "Bùi Tiến Thành Long";
        int age = 20;
        float s1 = 1.5f;
        double s2 = 1.5;
        char s3 = 'a';
        /*
        4 : Toán tử
        a, b đc gọi là toán hạng
        Toán tử : +, - , *, /
        Biểu thức : phải có giá trị trả về
         */
//        int a = 5;
//        a= a +1;
//        a+=1;
//        a++;
//        ++a;
//        int b = a++;
//        //int c = a+b;
//        // số : ++, --,
//        System.out.println(b);
//        System.out.println(a);


//         1 : tạo thư mục .git (làm lần đầu)
//         git init
//
//        2 : xem sự thay đổi
//         git status
//
//        3 : lưu trữ thay đổi
//         git add.
//
//        4. lưu trữ vào local repo
//         git commit -m "tên message"
    /*
    5 : cau dieu kien (if else)
    {} : scope (pham vi)
     */
//        int a = 5;
//        int b = 10;
//        int ketqua = 0;
//
//        if (a>b) ketqua = 1;
//        else if (a==b) ketqua = 0;
//        else ketqua = -1;
//        Toán tử ba ngôi
//        ketqua = a>b ? 1 :a<b ? -1: 0;
//        if (a < b) {
//            return;
//        }
//        System.out.println("Next");
//        Lỗi Runtime
        int thang= 5;
        switch (thang){
            case 1 : System.out.println("Quí 1");
                break;
            case 2 : System.out.println("Quí 2");
                break;
            case 3 : System.out.println("Quí 3");
                break;
            default: System.out.println("Không nằm trong quí");
        }
        System.out.println("Thoát khỏi switch");
    }
}
