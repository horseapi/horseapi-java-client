package com.horseapi.apiclient.model;

import java.util.Objects;

public class RaceResult {
    public String resultType;
    public Double payoutBaseWager;
    public Double payout;
    public String winningTicket;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceResult that = (RaceResult) o;
        return Objects.equals(resultType, that.resultType) &&
                Objects.equals(payoutBaseWager, that.payoutBaseWager) &&
                Objects.equals(payout, that.payout) &&
                Objects.equals(winningTicket, that.winningTicket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultType, payoutBaseWager, payout, winningTicket);
    }
}
