#로또 미션

## 기능 목록

- [ ] 금액을 입력하여 로또를 구매한다.  - InputDevice#setMoneyToBuyLotto()
    - [ ] 구입 금액이 1000 단위인지 검증한다. - Validator#validateMoney()
- [ ] 구매한 로또의 수량 및 번호 정보를 출력한다 - LottoUi#printLottoInfo()
- [ ] 로또 당첨 번호를 입력한다. - InputDevice#setWinningNumbers()
    - [ ] 로또 당첨 번호를 검증한다. - Validator#validateWinningNumbers
- [ ] 로또 보너스 번호를 입력한다. - InputDevice#setBonusNumber()
    - [ ] 보너스 번호를 검증한다. - Validator#validateBonusNumber
- [ ] 내가 구매한 로또의 번호와 당첨번호 및 보너스 번호를 비교한다. - LottoManager#compare()
- [ ] 비교 결과를 바탕으로 로또 당첨 결과를 출력한다 - LottoUi#printResult()
- [ ] 로또의 수익률을 출력한다 - LottoUi#printYield()
  - [ ] 로또 수익률을 계산한다 - LottoManager#calculateYield()