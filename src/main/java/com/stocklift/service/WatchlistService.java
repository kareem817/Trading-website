package com.stocklift.service;

import com.stocklift.modal.Coin;
import com.stocklift.modal.User;
import com.stocklift.modal.Watchlist;

public interface WatchlistService {

        Watchlist findUserWatchlist(Long userId) throws Exception;
        Watchlist createWatchlist(User user);
        Watchlist findById(Long id) throws Exception;

        Coin addItemToWatchlist(Coin coin, User user) throws Exception;
    }

