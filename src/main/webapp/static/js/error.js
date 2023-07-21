document.addEventListener("DOMContentLoaded", () => {
  const input_b_code = document.querySelector(
    "form.book input[name='b_code'].bookInsert"
  );
  const input_b_name = document.querySelector(
    "form.book input[name='b_name'].bookInsert"
  );
  const input_b_name_detail = document.querySelector(
    "form.book input[name='b_name'].bookDetail"
  );
  const input_book_name_value = input_b_name_detail.value;
  const input_b_author = document.querySelector(
    "form.book input[name='b_author']"
  );
  const input_b_year = document.querySelector("form.book input[name='b_year']");
  const input_b_rprice = document.querySelector(
    "form.book input[name='b_rprice']"
  );

  const input_b_err = document.querySelector("div.book.errorMSG");

  const err_clear = (err_box) => {
    err_box?.classList.remove("on");
    err_box.innerHTML = "";
  };
  const err_message = (e, err_box, message) => {
    const value = e.value;
    if (!value) {
      err_box.classList.add("on");
      err_box.innerHTML = message;
      e.select();
      return false;
    }
    return true;
  };

  input_b_code?.select();
  input_b_code?.addEventListener("blur", async (e) => {
    err_clear(input_b_err);
    if (!err_message(e.target, input_b_err, "도서코드를 입력하세요")) {
      return false;
    }
    const bookCode = input_b_code.value;
    const res = await fetch(`${rootPath}/book_check?bookCode=${bookCode}`);
    const json = await res.json();
    console.log(json);
    if (json.b_code === "NOT") {
      input_b_err.classList.add("on");
      input_b_err.innerHTML = "* 이미 등록된 도서 코드입니다.";
      e.select();
    }
  });
  input_b_name?.addEventListener("blur", async (e) => {
    err_clear(input_b_err);
    if (!err_message(e.target, input_b_err, "도서명을 입력하세요")) {
      return false;
    }
    const bookName = input_b_name.value;
    const res = await fetch(`${rootPath}/book_name_check?bookName=${bookName}`);
    const json = await res.json();
    console.log(json);

    if (json.b_name === "NOT") {
      input_b_err.classList.add("on");
      input_b_err.innerHTML = "* 이미 등록된 도서 이름입니다.";
      e.select();
    }
  });
  input_b_name_detail?.addEventListener("blur", async (e) => {
    err_clear(input_b_err);
    if (!err_message(e.target, input_b_err, "도서명을 입력하세요")) {
      return false;
    }
    const bookName = input_b_name_detail.value;
    const res = await fetch(`${rootPath}/book_name_check?bookName=${bookName}`);
    const json = await res.json();
    console.log(json);
    if (json.b_name === input_book_name_value) {
    } else if (json.b_name === "NOT") {
      input_b_err.classList.add("on");
      input_b_err.innerHTML = "* 이미 등록된 도서 이름입니다.";
      e.select();
    }
  });
  input_b_author?.addEventListener("blur", (e) => {
    err_clear(input_b_err);
    if (!err_message(e.target, input_b_err, "저자를 입력하세요")) {
      return false;
    }
  });
  input_b_year?.addEventListener("blur", (e) => {
    err_clear(input_b_err);
    if (!err_message(e.target, input_b_err, "구입연도를 입력하세요")) {
      return false;
    }
  });
  input_b_rprice?.addEventListener("blur", (e) => {
    err_clear(input_b_err);
    if (!err_message(e.target, input_b_err, "대여가격을 입력하세요")) {
      return false;
    }
  });
});
