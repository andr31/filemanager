package com.filemanager.utils.transporters.dto.complex;

import com.filemanager.utils.transporters.dto.simple.ConsultationDto;
import com.filemanager.utils.transporters.dto.simple.DoctorDto;
import com.filemanager.utils.transporters.dto.simple.PacientDto;

public class ConsultationComplexDto extends ConsultationDto {

	private PacientDto pacient;
	private DoctorDto doctor;

	public PacientDto getPacient() {
		return pacient;
	}

	public void setPacient(PacientDto pacient) {
		this.pacient = pacient;
	}

	public DoctorDto getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorDto doctor) {
		this.doctor = doctor;
	}

}
