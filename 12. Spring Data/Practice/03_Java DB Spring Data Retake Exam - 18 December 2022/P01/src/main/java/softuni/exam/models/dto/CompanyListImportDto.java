package softuni.exam.models.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "companies")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompanyListImportDto {
    @XmlElement(name = "company")
    private List<CompanyImportDto> dtos;

    public CompanyListImportDto() {
    }

    public List<CompanyImportDto> getDtos() {
        return dtos;
    }

    public void setDtos(List<CompanyImportDto> dtos) {
        this.dtos = dtos;
    }
}
