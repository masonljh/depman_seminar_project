package com.depman.androidmvpproject.main;

import androidx.annotation.NonNull;

import com.depman.androidmvpproject.base.BasePresenter;
import com.depman.androidmvpproject.base.BaseView;
import com.depman.androidmvpproject.data.Movie;

import java.util.List;

public interface MainContract {

	interface View extends BaseView<Presenter> {

		void setLoadingIndicator(boolean active);

		void addMovies(List<Movie> movieList);

		void clearMovies();

		void setLoadMore(boolean canLoadMore);

		void showNoMovies();

		void showToast(String msg);

		void showToast(int resId);

	}

	interface Presenter extends BasePresenter {

		void refresh();

		void loadMore();

		void openMovieDetails(@NonNull Movie movie);

	}

}
