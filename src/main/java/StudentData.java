import java.util.List;

public class StudentData {
    public static List<Student> createData() {
        List<Student> studentList = (List<Student>) List.of(
                new Student("18424010", "Đặng Văn Thường", "dvthuong@gmail.com", 2, 10, 10, 4.5),
                new Student("18424011", "Nguyễn Ngọc Châu", "nnchau@outlook.com", 3, 8, 8, 5.5),
                new Student("18424012", "Nguyễn Minh Anh", "nmanh@yahoo.com", 0, 3, 8, 5.0),
                new Student("18424013", "Đỗ Ngọc Minh", "dnminh@outlook.com", 2, 8, 9.5, 5.5),
                new Student("18424014", "Lê Thùy Linh", "ltlinh@onemount.com", 0, 6, 8, 7.5),
                new Student("18424015", "Nguyễn Ngọc Bảo Anh", "nnbanh@outlook.com", 5, 7, 8, 9.5),
                new Student("18424016", "Nguyễn Lê Thu Uyên", "nltuyen@gmail.com", 2, 6.5, 8, 5.5),
                new Student("18424017", "Ngô Anh Đức", "naduc@outlook.com", 1, 4, 6, 10),
                new Student("18424018", "Hoang Đức Tiến", "hdtien@gmail.com", 1, 8, 5.5, 9.5),
                new Student("18424019", "Nguyễn Nhật Cường", "nncuong@outlook.com", 2, 8, 8.5, 5.5),
                new Student("18424020", "Nguyễn Lê Anh", "anhnl@outlook.com", 5, 7, 8, 6.5),
                new Student("18424021", "Nguyễn Bảo Quyên", "nltuyen@gmail.com", 2, 6.5, 8, 7.5),
                new Student("18424022", "Đoàn Thu Hằng", "hangdt@outlook.com", 1, 4, 6, 10),
                new Student("18424023", "Lê Anh Đức", "ducla@gmail.com", 1, 8, 5.5, 9.5),
                new Student("18424024", "Nguyễn Quang Hải", "hainq@outlook.com", 2, 8, 8.5, 8.5
                )
        );
        return studentList;
    }
}
