package com.depman.androidmvpproject.data;

import java.util.List;

public class Movie {
	private String code;
	private String name;

	private String engName;
	private String createdYear;
	private String openDate;
	private String type;
	private String state;
	private String nation;
	private String genre;
	private List<Director> directors;
	private List<Company> companies;

	public class Director {
		private String name;
	}

	public class Company {
		private String name;
		private String code;
	}
}

//		movieCd	문자열	영화코드를 출력합니다.
//		movieNm	문자열	영화명(국문)을 출력합니다.
//		movieNmEn	문자열	영화명(영문)을 출력합니다.
//		prdtYear	문자열	제작연도를 출력합니다.
//		openDt	문자열	개봉연도를 출력합니다.
//		typeNm	문자열	영화유형을 출력합니다.
//		prdtStatNm	문자열	제작상태를 출력합니다.
//		nationAlt	문자열	제작국가(전체)를 출력합니다.
//		genreAlt	문자열	영화장르(전체)를 출력합니다.
//		repNationNm	문자열	대표 제작국가명을 출력합니다.
//		repGenreNm	문자열	대표 장르명을 출력합니다.
//		directors	문자열	영화감독을 나타냅니다.
//		peopleNm	문자열	영화감독명을 출력합니다.
//		companys	문자열	제작사를 나타냅니다.
//		companyCd	문자열	제작사 코드를 출력합니다.
//		companyNm	문자열	제작사명을 출력합니다.

// http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieList.json?key=430156241533f1d058c603178cc3ca0e&curPage=2