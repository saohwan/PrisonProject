package PrisonDataSystem.cli.prison.repository;

import PrisonDataSystem.cli.prison.domain.Prison;

import java.util.List;

//역할: 데이터 저장소 역할을 수행하는 저장소 기능의 명세
public interface PrisonRepository {

    //죄수 정보 추가
    void addPrisoner(Prison prison);

    //조건별 죄수 검색
    /**
     * @param keyword 검색어
     * @param condition 검색 조건
     * @return 검색에 따른 죄수정보 리스트
     */

//    searchMovieList("메롱", PUB_YEAR);
    List<Prison> searchMovieList(String keyword, SearchCondition condition);

    //특정 죄수 1명 검색
    Prison searchPrisonOne(int prisonNumber);

    //특정 죄수 삭제(출소)
    void removePrison(int serialNumber);

}
