package lotto;

public class Validator {

    public void validateMoney(String money) {
        if (!money.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException("숫자를 입력해주세요");
        }

        if (Integer.parseInt(money) / 1000 != 0) {
            throw new IllegalArgumentException("1000으로 나누어 떨어지는 숫자를 입력해주세요");
        }
    }
}
