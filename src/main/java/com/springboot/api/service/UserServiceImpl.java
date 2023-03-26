//package com.springboot.api.service;
//
//import com.springboot.api.model.User;
//import com.springboot.api.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//    // O @Autowired é uma anotação do Spring Framework que permite a injeção de dependências automaticamente em classes.
//
//    @Override
//    public User save(User user) {
//        return userRepository.save(user);
//    }
//    // O @Override é uma anotação que usamos antes do método que estamos sobrescrevendo para indicar ao compilador que estamos alterando um método da classe pai na classe filha.
//    @Override
//    public List<User> findAll() {
//        return userRepository.findAll();
//    }
//
//    @Override
//    public Optional<User> findById(Long id) {
//        return userRepository.findById(id);
//    }
//
//    @Override
//    public User update(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        userRepository.deleteById(id);
//    }
//}
