document.addEventListener("DOMContentLoaded", () => {
  const bookList = document.querySelector("table.bookList");

  const bookClickHandler = (e) => {
    const target = e.target; // li
    if (target.tagName === "TD") {
      const targetClassName = target.className;
      let URL = `${rootPath}/detail?bcode=` + targetClassName;

      document.location.href = URL;
    }
  };

  bookList?.addEventListener("click", bookClickHandler);
});
