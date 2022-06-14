module ru.gb.perov.javafxproject_part2homework4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.perov.javafxproject_part2homework4 to javafx.fxml;
    exports ru.gb.perov.javafxproject_part2homework4;
}