
# LoanProductData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**fundId** | **Long** |  |  [optional]
**fundName** | **String** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**closeDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**currency** | [**CurrencyData**](CurrencyData.md) |  |  [optional]
**principal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**minPrincipal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**maxPrincipal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**numberOfRepayments** | **Integer** |  |  [optional]
**minNumberOfRepayments** | **Integer** |  |  [optional]
**maxNumberOfRepayments** | **Integer** |  |  [optional]
**repaymentEvery** | **Integer** |  |  [optional]
**repaymentFrequencyType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional]
**interestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**minInterestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**maxInterestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interestRateFrequencyType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional]
**annualInterestRate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interestRateDifferential** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**minDifferentialLendingRate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**defaultDifferentialLendingRate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**maxDifferentialLendingRate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**amortizationType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional]
**interestType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional]
**interestCalculationPeriodType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional]
**allowPartialPeriodInterestCalcualtion** | **Boolean** |  |  [optional]
**inArrearsTolerance** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**transactionProcessingStrategyId** | **Long** |  |  [optional]
**transactionProcessingStrategyName** | **String** |  |  [optional]
**graceOnPrincipalPayment** | **Integer** |  |  [optional]
**recurringMoratoriumOnPrincipalPeriods** | **Integer** |  |  [optional]
**graceOnInterestPayment** | **Integer** |  |  [optional]
**graceOnInterestCharged** | **Integer** |  |  [optional]
**graceOnArrearsAgeing** | **Integer** |  |  [optional]
**daysInMonthType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional]
**daysInYearType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional]
**interestRecalculationData** | [**LoanProductInterestRecalculationData**](LoanProductInterestRecalculationData.md) |  |  [optional]
**principalVariationsForBorrowerCycle** | [**List&lt;LoanProductBorrowerCycleVariationData&gt;**](LoanProductBorrowerCycleVariationData.md) |  |  [optional]
**interestRateVariationsForBorrowerCycle** | [**List&lt;LoanProductBorrowerCycleVariationData&gt;**](LoanProductBorrowerCycleVariationData.md) |  |  [optional]
**numberOfRepaymentVariationsForBorrowerCycle** | [**List&lt;LoanProductBorrowerCycleVariationData&gt;**](LoanProductBorrowerCycleVariationData.md) |  |  [optional]
**fundOptions** | [**List&lt;FundData&gt;**](FundData.md) |  |  [optional]
**repaymentFrequencyTypeOptions** | [**List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional]
**interestRateFrequencyTypeOptions** | [**List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional]
**amortizationTypeOptions** | [**List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional]
**interestTypeOptions** | [**List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional]
**interestCalculationPeriodTypeOptions** | [**List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional]
**chargeOptions** | [**List&lt;ChargeData&gt;**](ChargeData.md) |  |  [optional]
**multiDisburseLoan** | **Boolean** |  |  [optional]
**outstandingLoanBalance** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**minimumGapBetweenInstallments** | **Integer** |  |  [optional]
**maximumGapBetweenInstallments** | **Integer** |  |  [optional]
**getloanProductConfigurableAttributes** | [**LoanProductConfigurableAttributes**](LoanProductConfigurableAttributes.md) |  |  [optional]
**equalAmortization** | **Boolean** |  |  [optional]
**floatingInterestRateCalculationAllowed** | **Boolean** |  |  [optional]
**linkedToFloatingInterestRates** | **Boolean** |  |  [optional]
**variableInstallmentsAllowed** | **Boolean** |  |  [optional]
**interestRecalculationEnabled** | **Boolean** |  |  [optional]
**compoundingToBePostedAsTransaction** | **Boolean** |  |  [optional]


