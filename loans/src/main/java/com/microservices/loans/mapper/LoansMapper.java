package com.microservices.loans.mapper;

import com.microservices.loans.dto.LoansDto;
import com.microservices.loans.entity.Loans;

public class LoansMapper {

    public static Loans mapToLoans(LoansDto loansDto, Loans loans) {

        loans.setLoanNumber(loansDto.getLoanNumber());
        loans.setLoanType(loansDto.getLoanType());
        loans.setTotalLoan(loansDto.getTotalLoan());
        loans.setAmountPaid(loansDto.getAmountPaid());
        loans.setMobileNumber(loansDto.getMobileNumber());
        loans.setOutstandingAmount(loansDto.getOutstandingAmount());

        return loans;
    }

    public static LoansDto mapToLoansDto(Loans loans, LoansDto loansDto) {

        loansDto.setLoanType(loans.getLoanType());
        loansDto.setLoanNumber(loans.getLoanNumber());
        loansDto.setTotalLoan(loans.getTotalLoan());
        loansDto.setMobileNumber(loans.getMobileNumber());
        loansDto.setOutstandingAmount(loans.getOutstandingAmount());
        loansDto.setAmountPaid(loans.getAmountPaid());

        return loansDto;
    }
}
