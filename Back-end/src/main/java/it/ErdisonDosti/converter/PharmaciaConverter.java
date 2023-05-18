package it.ErdisonDosti.converter;

import it.ErdisonDosti.dto.PharmaciaDTO;
import it.ErdisonDosti.entity.Pharmacy;
import org.springframework.stereotype.Component;


@Component
public class PharmaciaConverter extends  AbstractConverter<Pharmacy, PharmaciaDTO>{
    @Override
    public Pharmacy toEntity(PharmaciaDTO pharmaciaDTO) {
       Pharmacy pharmacy=null;
        if (pharmaciaDTO != null) {
            pharmacy=Pharmacy
                    .builder()
                    .id(pharmaciaDTO.getId())
                    .name(pharmaciaDTO.getName())
                    .city(pharmaciaDTO.getCity())
                    .vatCode(pharmaciaDTO.getVatCode())
                    .address(pharmaciaDTO.getAddress())
                    .build();
        }
        return pharmacy;
    }

    @Override
    public PharmaciaDTO toDTO(Pharmacy pharmacy) {
        PharmaciaDTO pharmaciaDTO=null;
        if (pharmacy != null) {
            pharmaciaDTO=PharmaciaDTO
                    .builder()
                    .id(pharmacy.getId())
                    .name(pharmacy.getName())
                    .city(pharmacy.getCity())
                    .vatCode(pharmacy.getVatCode())
                    .address(pharmacy.getAddress())
                    .build();
        }
        return pharmaciaDTO;
    }
}
