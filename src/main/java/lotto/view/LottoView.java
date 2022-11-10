package lotto.view;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import lotto.domain.Lotto;
import lotto.domain.LottoResult;

public class LottoView {

    private static final String START_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String WINNINGS_NUMBERS_SETTING_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final String BONUS_NUMBER_SETTING_MESSAGE = "보너스 번호를 입력해 주세요.";
    private static final String LOTTO_NUMBER_MESSAGE = "개를 구매했습니다.";

    private static final String PREFIX_YIELD_MESSAGE = "총 수익률은 ";
    private static final String SUFFIX_YIELD_MESSAGE = "%입니다.";

    private static final int SKIP_RESULT_ELSE_CASE = 1;


    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public void printWinningNumbersSettingMessage() {
        System.out.println(WINNINGS_NUMBERS_SETTING_MESSAGE);
    }

    public void printBonusNumberSettingMessage() {
        System.out.println(BONUS_NUMBER_SETTING_MESSAGE);
    }

    public void printLottoBundleInfo(List<Lotto> lottoBundle) {
        System.out.println(lottoBundle.size() + LOTTO_NUMBER_MESSAGE);
        for (Lotto lotto : lottoBundle) {
            lotto.printNumbers();
        }
    }

    public void printLottoResult(List<LottoResult> lottoResults) {
        System.out.println("당첨 통계");
        System.out.println("---");

        Map<LottoResult, Long> lottoResultToCount = lottoResults.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Arrays.stream(LottoResult.values())
                .skip(SKIP_RESULT_ELSE_CASE)
                .forEach(lottoResult -> lottoResult.printMessage(lottoResultToCount));
    }

    public void printYield(double yield) {
        String yieldFormat = String.format("%.1f", yield);
        System.out.println(PREFIX_YIELD_MESSAGE + yieldFormat + SUFFIX_YIELD_MESSAGE);
    }
}
