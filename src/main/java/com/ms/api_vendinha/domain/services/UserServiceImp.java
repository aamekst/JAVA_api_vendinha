package com.ms.api_vendinha.domain.services;


import com.ms.api_vendinha.domain.dto.UserRequestDto;
import com.ms.api_vendinha.domain.dto.UserResponseDto;
import com.ms.api_vendinha.domain.entity.User;
import com.ms.api_vendinha.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserServiceInterface {
    public UserRepository userRepository;
    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        User user = new User();
        user.setNome(userRequestDto.nome);
        this.userRepository.save(user);

        return new UserResponseDto(
                user.getId(),
                user.getNome()
        );
    }
}