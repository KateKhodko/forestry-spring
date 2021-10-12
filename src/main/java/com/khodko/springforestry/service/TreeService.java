package com.khodko.springforestry.service;

import com.khodko.springforestry.entity.Tree;
import com.khodko.springforestry.repository.TreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TreeService {

    private TreeRepository treeRepository;

    public List<Tree> findAll() {
        return (List<Tree>) treeRepository.findAll();
    }
}
