package lotto;

import camp.nextstep.edu.missionutils.Console;

public class InputDevice {

    private Validator validator = new Validator();

    public String setMoneyToBuyLotto() {
        String money = Console.readLine();
        validator.validateMoney(money);
        return money;
    }
}
