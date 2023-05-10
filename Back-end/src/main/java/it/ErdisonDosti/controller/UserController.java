package it.ErdisonDosti.controller;

import it.ErdisonDosti.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/admin/user")
public class UserController extends AbstractController<UserDTO>{
}
