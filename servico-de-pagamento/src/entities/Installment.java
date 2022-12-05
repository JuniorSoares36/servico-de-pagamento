package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private LocalDate date;
	private Double amount;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installment() {
		
	}
	
	public Installment(LocalDate dueDate, Double amount) {
		super();
		this.date = dueDate;
		this.amount = amount;
	}

	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public static DateTimeFormatter getFmt() {
		return fmt;
	}

	public static void setFmt(DateTimeFormatter fmt) {
		Installment.fmt = fmt;
	}

	@Override
	public String toString() {
		return date + " - " + String.format("%.2f", amount);
	}
	


}
