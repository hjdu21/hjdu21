package bitcamp.pms.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import bitcamp.pms.annotation.Component;
import bitcamp.pms.domain.Board;

@Component
public class BoardDao {
  static final String filename = "board.data";

  public List<Board> selectList() throws Exception {
    FileReader in = new FileReader(filename);
    BufferedReader in1 = new BufferedReader(in);

    ArrayList<Board> boards = new ArrayList<>();
    String str = null;
    while ((str = in1.readLine()) != null) {
      String[] values = str.split(",");
      Board board = new Board();
      board.setTitle(values[0]);
      board.setContent(values[1]);
      board.setViews(Integer.parseInt(values[2]));
      board.setPassword(values[3]);
      board.setCreatedDate(Date.valueOf(values[4]));
      boards.add(board);

    }
    in1.close();
    in.close();
    return boards;
  }

  public void insert(Board board) throws Exception {
    FileWriter out = new FileWriter(filename, true);
    BufferedWriter out1 = new BufferedWriter(out);
    PrintWriter out2 = new PrintWriter(out1);

    out2.println(board.toCSV());

    out2.close();
    out1.close();
    out.close();
  }

  public void save(List<Board> boards) throws Exception {
    FileWriter out = new FileWriter(filename);
    BufferedWriter out1 = new BufferedWriter(out);
    PrintWriter out2 = new PrintWriter(out1);

    for (Board board : boards) {
      out2.println(board.toCSV());
    }

    out2.close();
    out1.close();
    out.close();
  }

  public Board selectOne(int no) throws Exception {
    List<Board> list = selectList();
    Board board = list.get(no);
    return board;
  }

  public void update(int no, Board board) throws Exception {
    List<Board> list = selectList();
    list.set(no, board);
    save(list);
  }

  public void delete(int no) throws Exception {
    List<Board> list = selectList();
    list.remove(no);
    save(list);    
  }
}
