package data.service;

import data.dto.ReportDto;
import data.dto.UserDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.dto.security.RefreshTokenDto;
import data.mapper.TokenMapper;
import data.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements UserServiceInter{

    private UserMapper userMapper;

    public void insertUser(UserDto dto) {
        userMapper.insertUser(dto);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }

    public UserDto getUserByUserId(int user_id){
        return userMapper.getUserByUserId(user_id);
    }

    @Override
    public int countEmail(String email) {
        return userMapper.countEmail(email);
    }

    /////////////////////경철//////////////////

    //회원목록 페이징 리스트
    public List<UserDto> getManagePagingList(String search,int startNum,int perPage){
        Map<String,Object> map=new HashMap<>();
        map.put("search",search);
        map.put("startNum",startNum);
        map.put("perPage",perPage);
        return userMapper.getManagePagingList(map);
    }
    //회원 목록 토탈카운트
    public int getManageTotalCount(){
        return userMapper.getManageTotalCount();
    }
    //회원 삭제
    @Override
    public void deleteUser(int user_id){
        userMapper.deleteUser(user_id);
    }

    //블랙리스트  회원 카운트
    public int getBlockListCount(){
        return userMapper.getBlockListCount();
    }

    //블랙리스트 회원 출력(new)
    @Override
    public List<ReportDto> getBlockList(String search, int startNum, int perPage){
        Map<String,Object> map=new HashMap<>();
        map.put("search",search);
        map.put("startNum",startNum);
        map.put("perPage",perPage);
        return userMapper.getBlockList(map);
    }


    //수연
    //알람
    public void updatealarm(UserDto dto){
        userMapper.updatealarm(dto);
    }
    //경고리스트
    public void insertReport(ReportDto dto){
        userMapper.insertReport(dto);
    }
    //유저 정보 수정
    public void updateUserInfo(UserDto dto){
        userMapper.updateUserInfo(dto);
    }
}
