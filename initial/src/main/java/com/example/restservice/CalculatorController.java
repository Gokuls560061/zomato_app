package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {


	@GetMapping("/rentcalculator")
	public calculatorResponse rentCalculator(@RequestParam(value = "rent", defaultValue = "0") String rent,@RequestParam(value = "months", defaultValue = "1") String months) {
		RentCalculator r = new RentCalculator(Integer.parseInt(rent), Integer.parseInt(months));
		calculatorResponse res = new calculatorResponse();
		res.rent = r.calculate();
		return res;
	}

		@GetMapping("/loanemicalculator")
		public calculatorResponse2 LoanEmiCalculator(@RequestParam(value = "loanAmount", defaultValue = "0") String loanAmount,@RequestParam(value = "timeInMonths", defaultValue = "1") String timeInMonths,@RequestParam(value = "rateOfInterest", defaultValue = "2") String rateOfInterest) {
			LoanEmiCalculator l = new LoanEmiCalculator(Integer.parseInt(loanAmount), Integer.parseInt(timeInMonths),Integer.parseInt(rateOfInterest));
			calculatorResponse2 res = new calculatorResponse2();
			res.laon = l.calculate();
			return res;
		}
		
		@GetMapping("/fdcalculator")
		public calculatorResponse3 FdCalculator(@RequestParam(value = "depositAmount", defaultValue = "0") String depositAmount,@RequestParam(value = "rateOfInterest", defaultValue = "1") String rateOfInterest,@RequestParam(value = "numberOfYears", defaultValue = "2") String numberOfYears) {
			FdCalculator f = new FdCalculator(Integer.parseInt(depositAmount), Integer.parseInt(rateOfInterest),Integer.parseInt(numberOfYears));
			calculatorResponse3 res = new calculatorResponse3();
			res.fdcal = f.calculate();
			return res;
		}
}
	
