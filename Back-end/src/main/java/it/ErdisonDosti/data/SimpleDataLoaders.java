//package it.ErdisonDosti.data;
//
//import com.github.javafaker.Faker;
//import it.ErdisonDosti.dao.ProductRepository;
//import it.ErdisonDosti.entity.EntityHasEntiy.PharmaciaHasProduct;
//import it.ErdisonDosti.entity.Pharmacy;
//import it.ErdisonDosti.entity.Product;
//import lombok.RequiredArgsConstructor;
//
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.stream.IntStream;
//
//
//@RequiredArgsConstructor
//@Slf4j
//@Component
//public class SimpleDataLoaders implements CommandLineRunner {
//
//    private  final ProductRepository productRepository;
//    private Logger logger= LoggerFactory.getLogger(SimpleDataLoaders.class);
//    private final Faker faker;
//
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("Loading Product Data into DB");
//        // create 100 product in db
//     List<Product> products= IntStream.rangeClosed(1,100)
//                .mapToObj(i-> new Product(
//                       faker.stock().toString(),
//                       faker.name().title(),
//                        faker.name().name(),
//                        faker.number().randomDouble(2,1,1),
//                        faker.number().randomDigitNotZero(),
//                        faker.name().name()
//                ))
//                .toList();
//
//        productRepository.saveAll(products);
//    }
//}
