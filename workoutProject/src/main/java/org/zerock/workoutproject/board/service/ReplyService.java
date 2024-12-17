package org.zerock.workoutproject.board.service;

import org.zerock.workoutproject.board.dto.PageRequestDTO;
import org.zerock.workoutproject.board.dto.PageResponseDTO;
import org.zerock.workoutproject.board.dto.ReplyDTO;

public interface ReplyService {
    Long register(ReplyDTO replyDTO);
    void remove(Long rno);
    PageResponseDTO<ReplyDTO> getListofBoard(Long bno, PageRequestDTO pageRequestDTO);
}