package src;
public enum MenuType {

    REGISTER(1),
    SHOW_LIST(2),
    DELETE(3),
    EXIT(4);

    private int number;

    public static MenuType fromNumber(int number) {
        for (MenuType type : values()) {
            if (type.number == number) {
                return type;
            }
        }
        throw new IllegalArgumentException("未対応のメニュー番号: " + number);
    }   

    private MenuType(int number) {
        this.number = number;
    }
}
