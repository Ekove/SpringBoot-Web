package strategy;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class AdditionalRateTax implements TaxStrategy
{
    private static final BigDecimal RATE = BigDecimal.valueOf(0.45);

    @Override
    public BigDecimal calculate(final BigDecimal salary)
    {
        return salary.subtract(salary.multiply(RATE));
    }
}
