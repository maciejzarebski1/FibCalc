package org.mz.fibcalc;

import java.math.BigDecimal;

public record RequestOutput (
        String appName,
        String author,
        String uniClass,
        BigDecimal result)
{
}
