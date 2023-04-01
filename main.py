from fastapi import FastAPI
from typing import Union

app = FastAPI()


@app.get("/")
def read_root():
    return {"Hello": "World"}


@app.get("/items/{item_id}")
def read_item(item_id: int, q: Union[str, None] = None):
    return {"item_id": item_id, "q": q}

@app.get("/poss/{positions}/")
def read_poss(positions: str, x: Union[str, None] = None, y: Union[str, None] = None, z: Union[str, None] = None):
    return {"Positions Correct": positions, "x": x, "y": y, "z": z}
