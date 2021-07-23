package kg.megacom.dtosqlex.mappers;


import kg.megacom.dtosqlex.models.PC;
import kg.megacom.dtosqlex.models.dto.PCDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PCMapper {

    PCMapper INSTANCE = Mappers.getMapper(PCMapper.class);

    PC toPC(PCDto pcDto);
    PCDto toPC(PC pc);

    List<PC> toPCs(List<PCDto> pcDtos);
    List<PCDto> toPCDtos(List<PC> pcs);

}
